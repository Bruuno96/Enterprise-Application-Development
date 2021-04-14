package br.com.fiap.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;	

// Teste.java - compila -> Bytecode (Teste.class) -> Execução (JVM)
//Target -> determina onde pode ser utilizada a anotação
//Field -> atributos

@Target( { ElementType.FIELD})

//Retention -> determina até quando a anotação estará presente

//SOURCE -> até o .java

//CLASS -> até o .class (default)

//RUNTIME -> até a JVM

@Retention(RetentionPolicy.RUNTIME)

public @interface Coluna {

    String nome();

    boolean unico() default false;

    int tamanho() default 255;

    

}
