package org.jaffa.plugins.definitions;

import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/*
 * ====================================================================
 * JAFFA - Java Application Framework For All
 *
 * Copyright (C) 2002 JAFFA Development Group
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Redistribution and use of this software and associated documentation ("Software"),
 * with or without modification, are permitted provided that the following conditions are met:
 * 1.	Redistributions of source code must retain copyright statements and notices.
 *         Redistributions must also contain a copy of this document.
 * 2.	Redistributions in binary form must reproduce the above copyright notice,
 * 	this list of conditions and the following disclaimer in the documentation
 * 	and/or other materials provided with the distribution.
 * 3.	The name "JAFFA" must not be used to endorse or promote products derived from
 * 	this Software without prior written permission. For written permission,
 * 	please contact mail to: jaffagroup@yahoo.com.
 * 4.	Products derived from this Software may not be called "JAFFA" nor may "JAFFA"
 * 	appear in their names without prior written permission.
 * 5.	Due credit should be given to the JAFFA Project (http://jaffa.sourceforge.net).
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 */

/**
 * Custom Resource Definition class
 */
public class CustomResourceDefinition {

    /**
     *Custom Resource Name
     */
    @Parameter
    private String customResource;

    /**
     *Custom Resource file type
     */
    @Parameter
    private String customResourceFileType;

    /**
     *Custom Resource Start Tag
     */
    @Parameter
    private String customResourceStartTag;

    /**
     *Custom Resource End Tag
     */
    @Parameter
    private String customResourceEndTag;

    /**
     *Custom Resource Fragment Type
     */
    @Parameter
    private String customResourceFragmentType;

    /**
     * Is resource a directory
     */
    @Parameter
    private Boolean directory;


    public Boolean isDirectory() {
        return directory;
    }

    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }



    public String getCustomResource() {
        return customResource;
    }

    public void setCustomResource(String customResource) {
        this.customResource = customResource;
    }

    public String getCustomResourceFileType() {
        return customResourceFileType;
    }

    public void setCustomResourceFileType(String customResourceFileType) {
        this.customResourceFileType = customResourceFileType;
    }

    public String getCustomResourceStartTag() {
        return customResourceStartTag;
    }

    public void setCustomResourceStartTag(String customResourceStartTag) {
        this.customResourceStartTag = customResourceStartTag;
    }

    public String getCustomResourceEndTag() {
        return customResourceEndTag;
    }

    public void setCustomResourceEndTag(String customResourceEndTag) {
        this.customResourceEndTag = customResourceEndTag;
    }

    public String getCustomResourceFragmentType() {
        return customResourceFragmentType;
    }

    public void setCustomResourceFragmentType(String customResourceFragmentType) {
        this.customResourceFragmentType = customResourceFragmentType;
    }

    public Definition getCustomResourceFragmentDefinition(){
        if(customResourceFragmentType!=null) {
            return new Definition(customResource, customResource + "." + customResourceFileType, customResource + "." + customResourceFragmentType, customResourceStartTag, customResourceEndTag);
        }else{
            return null;
        }
    }


    public Definition getCustomResourceFileDefinition(){
        if(customResourceFragmentType==null) {
            return new Definition(customResource, customResource + "." + customResourceFileType, customResource + "*." + customResourceFileType, "", "");
        }else{
            return null;
        }
    }



    @Override
    public String toString() {
        return "CustomResourceDefinition{" +
                "customResource='" + customResource + '\'' +
                ", customResourceFileType='" + customResourceFileType + '\'' +
                ", customResourceStartTag='" + customResourceStartTag + '\'' +
                ", customResourceEndTag='" + customResourceEndTag + '\'' +
                ", customResourceFragmentType='" + customResourceFragmentType + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }

}
