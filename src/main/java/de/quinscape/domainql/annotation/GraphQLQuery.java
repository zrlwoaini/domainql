package de.quinscape.domainql.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a graphql query method.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GraphQLQuery
{
    /**
     * Name of the graphql query. If left empty (the default), the method name is used.
     *
     * @return name or empty
     */
    String value() default "";

    /**
     * Description for this query.
     *
     * @return description
     */
    String description() default "";
    
    /**
     * If set to <code>true</code>, provide response as-is with standard JSONification rules. Doing so is only
     * valid if the DomainQL service is configured to support the @full directive
     */
    boolean full() default false;
}
