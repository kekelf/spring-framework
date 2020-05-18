package com.container.beanFactoryPostProcessor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

/**
 *BeanFactoryPostProcessor再bean信息加载成BeanDefinition之后实例化bean之前，修改bean信息 
 *
 */
public class ObsenityRemovingBeanFactoryPostProssor implements BeanFactoryPostProcessor{
	private Set<String> obscenties = new HashSet<String>();

	
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = new StringValueResolver() {

				@Override
				public String resolveStringValue(String strVal) {
					if (isObscene(strVal)) {
						return "*****";
					}
					return strVal;
				}
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
	}

	private boolean isObscene(String strVal) {
		String potentialObscenity = strVal.toUpperCase();
		return this.obscenties.contains(potentialObscenity);
	}
	
	public void setObscenties(Set<String> obcenties) {
		System.out.println("==========set============");
		this.obscenties.clear();
		for (String obscenity : obcenties) {
			this.obscenties.add(obscenity.toUpperCase());
		}
	}
	
}
