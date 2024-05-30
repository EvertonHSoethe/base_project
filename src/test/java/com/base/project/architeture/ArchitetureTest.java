package com.base.project.architeture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;

@Tag(value = "  architecture")
public class ArchitetureTest {

    private final JavaClasses importedClasses = new ClassFileImporter().importPackages("com.base.project");
    @Test
    void noClassesShouldUseFieldInjection() {
        ArchRule rule = fields()
                .should().notBeAnnotatedWith("org.springframework.beans.factory.annotation.Autowired")
                .because("Field injection is not recommended");

        rule.check(importedClasses);
    }

    @Test
    void noPublicFields() {
        ArchRule rule = fields()
                .that().areDeclaredInClassesThat().resideInAPackage("..model..")
                .should().notBePublic()
                .because("Model classes should not have public fields");

        rule.check(importedClasses);
    }

    @Test
    void controllersShouldBeAnnotatedWithControllerOrRestController() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Controller")
                .should().beAnnotatedWith(Controller.class)
                .orShould().beAnnotatedWith(RestController.class)
                .because("Controllers should be annotated with @Controller or @RestController");

        rule.check(importedClasses);
    }

    @Test
    void controllersShouldResideInControllerPackage() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Controller")
                .should().resideInAPackage("..controller..")
                .because("Controllers should be in the controller package");

        rule.check(importedClasses);
    }

    @Test
    void servicesShouldResideInServicePackage() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Service")
                .should().resideInAPackage("..service..")
                .because("Services should be in the service package");

        rule.check(importedClasses);
    }

    @Test
    void servicesShouldBeAnnotatedWithService() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Service")
                .should().beAnnotatedWith(Service.class)
                .because("Services should be annotated with @Service");

        rule.check(importedClasses);
    }

    @Test
    void repositoryShouldResideInRepositoryPackage() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Repository")
                .should().resideInAPackage("..repository..")
                .because("Repositories should be in the repository package");

        rule.check(importedClasses);
    }

    @Test
    void modelShouldResideInModelPackage() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("Model")
                .should().resideInAPackage("..model..")
                .because("Models should be in the model package");

        rule.check(importedClasses);
    }

    @Test
    void dtosShouldResideInDtoPackage() {
        ArchRule rule = classes()
                .that().haveSimpleNameEndingWith("DTO")
                .should().resideInAPackage("..dto..")
                .because("Dtos should be in the dto package");

        rule.check(importedClasses);
    }
}
