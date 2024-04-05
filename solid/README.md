# SOLID

## Single Responsibility Principle
Chaque classe doit être responsable que d'une seule chose

## Open-Closed Principle
Tu écris la classe A, tes collègues souhaitent ensuite apporter des modifications.
Ils peuvent facilement le faisant un extend de la classe A, sans apporter de modifications dans A.

Typiquement, pas de IF avec des process pour des cas différent

#### BAD:
```
Class Course{
    IF (onLine) {}
    IF (onSite) {}
} 
```

#### GOOD
```
Class Course {}
Class OnLineCourse extends Course {}
Class OnSiteCourse extends Course
```

## Liskov Substitution Principle

Substitution = Remplacement

```
Class Animal
Class Cat extends Animal
Class Dog extends Animal
```

Alors, dans un code, `Cat` et `Dog` doivent être intercheangable sans casser le code qui les utilise

## Interface Segregation Principle

Single Responsibility Principle appliquée a une Interface
Une interface doit être splitée en plusieurs interface qui font chacune une seule chose

## Dependency Inversion Principle

Une classe devrait au maximum dépendre d'interfaces, et non pas d' implémentation concrètes. 

Les implémentations pourront être changés sans modifier le code qui manipule cette implémentation à travers l'interface

#### BAD

```

Class ConsoleLogger implements Logger {}

Class ReportGeneraor {
    //BAD
    private ConsoleLogger myLogger

    logger.log("Error Message")
}
```

#### GOOD
```
Interface Logger {}

Class ConsoleLogger implements Logger {}

Class ReportGeneraor {
    //GOOD
    private Logger myLogger

    logger.log("Error Message")
}
```
