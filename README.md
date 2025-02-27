# cORE API

![Maven Central Version](https://img.shields.io/maven-central/v/design.ore.api/cORE-API)
![Maven Central Last Update](https://img.shields.io/maven-central/last-update/design.ore.api/cORE-API)

## Overview

The **cORE API** is a public repository that contains necessary classes for access to and authentication against the **cORE** servers.

## Getting Started

To get started with the cORE API, follow these steps:

1. **Add Repository to your Project:**
   Maven Central is used to host the public repository. Make sure that you have the repository source listed in your package manager.

   Gradle:
   ```bash
   repositories {
      mavenCentral()
   }
   ```
   Maven:
   Maven already includes mavenCentral.

   Then add the API to your project dependancies.

   Gradle:
   ```bash
   dependencies
   {
      implementation 'design.ore.api:cORE-API:1.0.0'
   }
   ```
   Maven:
   ```bash
   <dependency>
	<groupId>design.ore.api</groupId>
	<artifactId>cORE-API</artifactId>
	<version>1.0.0</version>
   </dependency>
   ```

## Documentation

Refer to the [official documentation](docs/) for comprehensive details on API usage and endpoint references.

## Sample Code

Explore the `examples` directory for sample code snippets and reference implementations to jumpstart your cORE development.

## Issues

If you encounter any issues or have suggestions for improvement, please [open an issue](https://github.com/Ore-Design/cORE-API/issues). Your feedback is highly valued.

## License

This repository and its contents' rights are reserved by Ore Designs Inc. Redistribution is prohibited. This API serves little to no purpose on its own as it has no functionality without access to paid cORE subscription services.

## Support

For support and inquiries related to cORE or the cORE API, contact our support team at [helpdesk@ore.design](mailto:helpdesk@ore.design).

© [Ore Designs Inc.](https://ore.design)
