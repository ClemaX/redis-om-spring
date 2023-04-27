package com.redis.om.spring.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
public @interface GeoIndexed {
  String fieldName() default "";
  String alias() default "";
  boolean noindex() default false;
}