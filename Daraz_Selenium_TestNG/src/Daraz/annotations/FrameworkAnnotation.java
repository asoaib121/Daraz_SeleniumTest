package Daraz.annotations;

import Daraz.Enums.AuthorType;
import Daraz.Enums.CategoryType;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface FrameworkAnnotation {
  public AuthorType[] author();
  //public String[] author();
  public CategoryType[]category();
 //public String[] category();
}
