#Scala DSL tutorial

This project illustrates how to create a simple DSL in Scala, and the Scala concepts that make it possible to build simple, elegant DSLs. This project contains accompanying code for my blogposts on building a Scala DSL here:

* Underlying Concepts
* Building a simple matcher DSL (Hullo, Scalatest!)

## Underlying Concepts
The tag "blogpost-part-1" contains a bunch of Scala worksheets in the `info.siddhuw.worksheets` package. These illustrate some of the concepts (implicit methods, implicit classes, 'pimping', and functions as first-class values) that I shall be using in subsequent posts to build a simple DSL

You can clone the code (which is a Maven project) using this command:

    git clone https://github.com/siddhuwarrier/scala-dsl-tutorial.git

The easiest way to run the worksheets is to import the Maven project into your IDE of choice, and then run the Scala worksheets. I haven't added a Maven target to run the worksheets.
