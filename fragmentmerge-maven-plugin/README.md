# fragmentmerge-maven-plugin
Fragment Merge Plugin for Jaffa Framework and applications built on Jaffa Framework

This plugin will merge the following fragments in the source and place them under /META-INF/ inside the jar

jawr.pfragment

dwr.xfragment

ApplicationRules_*.properties

ApplicationResources.pfragment

ComponentDefinition.xfragment

StrutsConfigFormBean.xfragment

StrutsConfigGlobalForward.xfragment

StrutsConfigAction.xfragment

ComponentTilesDefinitions.xfragment

navigation.xml

business-functions.xml

roles.xml

### Usage 
Add this fragement to your pom

```sh

      <plugin>
        <groupId>org.jaffa.maven</groupId>
        <artifactId>fragmentmerge-maven-plugin</artifactId>
        <configuration>
        <!-- Optional configuration -->
        <!-- Definition for any additional custom resources to be included in fragment merge -->
            <customResourceDefinition>
              <customResource>alerts</customResource>
              <customResourceFileType>xml</customResourceFileType>
              <!-- customResourceFragmentType is optional, if not included the definition is considered a file under resource -->
              <customResourceFragmentType>xfragment</customResourceFragmentType>
              <customResourceStartTag><![CDATA[<?xml version="1.0" encoding="UTF-8"?>\n<alerts>\n]]></customResourceStartTag>
              <customResourceEndTag><![CDATA[\n</alerts>]]></customResourceEndTag>
            </customResourceDefinition>
          <skipConfigFiles>
          <!-- to completely skip merging jawr files -->
            <skipConfigFile>jawr</skipConfigFile>
          </skipConfigFiles>
        </configuration>
      </plugin>
```


