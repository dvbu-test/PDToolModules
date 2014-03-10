
To Developers:

Generate schema documentation, use Stylus Studio.
------------------------------------------------------
1) Open the schema in Stylus studio
2) Click on the Documentation tab in the center window
3) Select the "Save Documentation" icon in the upper left corner of the window
4) Browse to PDToolModules/docs
5) Select PDToolModules.xsd.html
6) Click Save
7) Click Yes to overwrite

Distribute documentation to the PDTool_6_2:
----------------------------------------------------------------------------
Run the "build.xml" in the PDToolModules directory
Right click on build.xml and select "Run as --> Ant Build"

The following operations will be performed:

1) Generate the JAXB libraries 
2) Distribute /dist/PDToolModules.jar to PDTool_6_2/lib 
3) The docs will be pulled in when PDTool_6_2 is built
 