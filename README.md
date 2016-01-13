# iot-microservices-spring-boot
Spring Boot application for Internet of Things microservices - currently works with EasyBulb/MiLight

To start, run it as a Spring Boot application, and point a browser at http://localhost:61455/

Available URLs are:

http://localhost:61455/easybulb/off.html - turns all lights off

http://localhost:61455/easybulb/off/{group}.html - turns a single group of lights (1-4) off

http://localhost:61455/easybulb/on.html - turns all lights on

http://localhost:61455/easybulb/on/{group}.html - turns a single group of lights (1-4) on

http://localhost:61455/easybulb/white.html - changes the colour of all lights to white

http://localhost:61455/easybulb/white/{group}.html- changes the colour of a single group of lights (1-4) to white

http://localhost:61455/easybulb/discoMode/{group}.html - turns on/toggles between Disco Modes (flashing/fading colours) for a single group of lights (1-4)

http://localhost:61455/easybulb/discoModeFaster.html - speeds up the flash/fade rate for Disco Mode

http://localhost:61455/easybulb/discoModeSlower.html - slows down the flash/fade rate for Disco Mode

http://localhost:61455/easybulb/brightness/{group}/{value}.html - changes the brightness for a single group of lights (1-4) to value (0-59)

http://localhost:61455/easybulb/colour/{group}/{value}.html - changes the colour for a single group of lights (1-4) to value (0-255) from RGB colour wheel
