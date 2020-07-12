Feature: Google search

@test
Scenario Outline: Verify required information is displayed as the first result in the browser after a google search
 Given user launches the browser with base url
 When user search with "<keyword>"
 Then verify "<information>" displayed as the first search result

Examples:

|keyword            |information|
|Clarivate Analytics|clarivate.com|



