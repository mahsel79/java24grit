package lektion10.classer;

/*
    Record

    Syntax för att ett record.
    Record skiljer sig från en vanlig klass genom att du INTE behöver ange getters och setter.
    Detta kommer gratis, autmagiskt. Dock inte setters. Record är final och alla värden som
    anges i konstruktorn, förbklir objektets värde.

 */
public record PersonRecord(String firstName, String lastName) {}
