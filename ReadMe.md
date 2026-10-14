# API Deserialization Test Automation

This project demonstrates API response deserialization using Java and RestAssured. It sends a PUT request to an API endpoint, deserializes the response body into a Java object, and validates the returned data through assertions.

## Technologies Used

- **Java** – Programming language
- **RestAssured** – REST API testing
- **Maven or Gradle** – Dependency management, depending on project configuration

## Project Overview

The purpose of this project is to demonstrate how API response data can be converted into Java objects and validated during automated API testing.

The test covers the following operations:

- Constructing an API URL with a path parameter
- Creating a request body
- Sending a PUT request
- Validating the HTTP response status
- Deserializing the response body into a Java object
- Comparing the returned data with expected test data

## Test Scenario

### Objective

Verify that the API response can be successfully deserialized into a Java object and that the returned data matches the expected values.

### Preconditions

- Java and RestAssured are configured.
- The API endpoint is accessible.
- The base URL, path parameter, and test data are correctly defined.
- Required dependencies are available.

### Test Steps

1. **Prepare the Request:** Define the base URL, path parameter, and request body.
2. **Send the PUT Request:** Submit the request to the specified API endpoint.
3. **Validate the Response:** Check the HTTP status code.
4. **Deserialize the Response:** Convert the response body into the corresponding Java object.
5. **Perform Assertions:** Compare the returned object fields against the expected test data.

### Expected Results

- The API returns the expected HTTP status code.
- The response body is successfully deserialized into a Java object.
- The returned data matches the expected values.
- All assertions pass.

## Dependencies

- **RestAssured:** Used to send HTTP requests and validate API responses.
- **Java:** Used to implement the test logic and represent response data as Java objects.

Dependency versions and installation instructions depend on the project's build configuration.

## Notes

- Ensure that the API endpoint and test data are correctly configured before execution.
- Review assertion failures and response details when troubleshooting test execution.
- This project demonstrates a focused API testing technique: response deserialization and data validation.
