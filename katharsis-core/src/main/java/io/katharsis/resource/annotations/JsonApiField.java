package io.katharsis.resource.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows to configure the supported features of a field.
 *
 * @since 3.1
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface JsonApiField {


	/**
	 * @return true if the field can be set with a POST request.
	 */
	boolean postable() default true;

	/**
	 * @return true if the field can be changed with a PATCH request.
	 */
	boolean patchable() default true;

}
