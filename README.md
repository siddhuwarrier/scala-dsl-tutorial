#Scala DSL tutorial

This project illustrates how to create a simple DSL in Scala, and the Scala concepts that make it possible to build simple, elegant DSLs. This project contains accompanying code for my blogposts on building a Scala DSL here:

* Underlying Concepts
* Building a simple matcher DSL (Hullo, Scalatest!)

## Underlying Concepts
The tag "blogpost-part-1" contains a bunch of Scala worksheets in the `info.siddhuw.worksheets` package. These illustrate some of the concepts (implicit methods, implicit classes, 'pimping', and functions as first-class values) that I shall be using in subsequent posts to build a simple DSL

You can clone the code (which is a Maven project) using this command:

    git clone https://github.com/siddhuwarrier/scala-dsl-tutorial.git

The easiest way to run the worksheets is to import the Maven project into your IDE of choice, and then run the Scala worksheets. I haven't added a Maven target to run the worksheets.

## Simple Matcher DSL

The tags:
* blogpost-part-2-feature-1
* blogpost-part-2-feature-2
* blogpost-part-2
contain Scala code and associated JUnit tests (a conscious decision was made not to use a Scala testing DSL like Scalatest as many of the verbs used in the simple matcher DSL clash with that used in the DSLs) for a simple matcher DSL that allows the user to perform operations like these:

    case class Person(name: String)
    "sidmeister" should equal "sidmeister" 
    Person("blah") should equal Person("sfsf") //should fail with a TestFailedException
