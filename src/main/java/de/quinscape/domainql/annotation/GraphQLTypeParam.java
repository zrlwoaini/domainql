package de.quinscape.domainql.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a query or mutation method class parameter as providing a type parameter
 */

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.PARAMETER)
public @interface GraphQLTypeParam
{
    /**
     * Returns the concrete classes to use for this type parameter.
     *
     * @return
     */
    Class[] types();

    /**
     * Pattern to create the GraphQL query/mutation name for this type parameter. If none is given, the name
     * is generated by taking the Java method name and adding the current type
     *
     * @return name or empty
     */
    String namePattern() default "";

}
