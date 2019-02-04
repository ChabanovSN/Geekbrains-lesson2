package net.zt.funcode.components.lifecycle;

import net.zt.funcode.annotation.ExpensiveCameraRoll;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ExpensiveCameraRollBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String className = beanDefinition.getBeanClassName();

            try {

                Class<?> beanClass = Class.forName(className);
                ExpensiveCameraRoll annotation = beanClass.getAnnotation(ExpensiveCameraRoll.class);

                if (annotation != null) {
                    Class usingCameraRollName = annotation.usingExpensiveCameraRoll();
                    beanDefinition.setBeanClassName(usingCameraRollName.getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
