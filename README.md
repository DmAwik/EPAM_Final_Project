# EPAM_Final_Project. WEB Project

Implement the application using Servlet and JSP technologies.
 The application architecture must conform to the Layered architecture and MVC patterns. Controller can only be of two kinds: role controller or application controller.

Database Requirements
· Information about the subject area should be stored in the database:
· If the data in the database is stored in Cyrillic, it is recommended to use utf-8 encoding
· JDBC-only database access technology
· To work with the database in the application, a thread-safe connection pool must be implemented, the use of synchronized and volatile is prohibited.
Dri database design is recommended to use no more than 6-8 tables
· To work with data in the application through the DAO template.

Basic application requirements
· The application interface must be localized; choice of languages: EN|BE|RU etc.
· The application must correctly handle emerging exceptions, including keeping their logs. Use Log4J2/SLF4J as a logger
· Classes and other entities of the application must be correctly structured into packages and have a name that reflects their functionality.
· When implementing the business logic of the application, design patterns should be used, if necessary (for example, GoF patterns: Factory Method, Command, Builder, Strategy, State, Observer, Singleton, Proxy, etc).
· To store user information between requests, use the session.
· Apply filters to intercept and modify request and response objects.
· Permission is granted to use AspectJ technologies and Web-services.
· JSTL tags must be used when implementing JSP pages, scriptlets are not allowed.
· When implementing the user interface, it is allowed to use any front-end development technologies (JavaScript, AJAX).
· Implement protection against re-execution of the request by pressing F5.
· Implement your own tags.
· Viewing "long lists" is desirable to organize in page-by-page mode.
· Validate the input data on the client and on the server.
· Documentation for the project must be prepared in accordance with the requirements of javadoc.
· The design of the code must comply with the Java Code Convention.
· When deploying the application, it is allowed to use Maven technology.
· The application must contain TestNG, JUnit, Mockito or EasyMock tests.

Minimum requirements for the functionality of the application
· Authorization (sign in) and exit (sign out) to / from the system.
· Registering a user and/or adding an artifact of the subject area of the system.
· Viewing information (for example: viewing all totalizator rates, order statistics, invoices, etc.)
· Removing information (for example: canceling an order, deleting an entity, etc.)
· Adding and modifying information (for example: create and edit a product, create and edit an order, etc.)
