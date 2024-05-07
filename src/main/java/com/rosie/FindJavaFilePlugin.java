package com.rosie;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Mojo(name = "findJavaFilePlugin", defaultPhase = LifecyclePhase.PACKAGE)
public class FindJavaFilePlugin extends AbstractMojo {
    @Parameter
    private String param;
    @Parameter
    private List<Integer> paramList;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        getLog().info("timer plugin is running，current time is " + currentTime);
        getLog().info("timer plugin is running，param is " + param);
        getLog().info("timer plugin is running，paramList is " + paramList);

    }
}
