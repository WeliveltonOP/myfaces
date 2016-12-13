/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.myfaces.component.search;

import java.util.Set;
import javax.faces.component.UIComponent;
import javax.faces.component.search.SearchExpressionContext;
import javax.faces.component.search.SearchExpressionHint;
import javax.faces.component.visit.VisitHint;
import javax.faces.context.FacesContext;

/**
 *
 */
public class SearchExpressionContextImpl extends SearchExpressionContext
{
    private final FacesContext facesContext;
    
    private UIComponent source;

    private Set<VisitHint> visitHints;
    
    private Set<SearchExpressionHint> expressionHints;
    
    public SearchExpressionContextImpl(FacesContext facesContext)
    {
        this.facesContext = facesContext;
    }

    /**
     * @return the source
     */
    public UIComponent getSource()
    {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(UIComponent source)
    {
        this.source = source;
    }

    /**
     * @return the visitHints
     */
    public Set<VisitHint> getVisitHints()
    {
        return visitHints;
    }

    /**
     * @param visitHints the visitHints to set
     */
    public void setVisitHints(Set<VisitHint> visitHints)
    {
        this.visitHints = visitHints;
    }

    /**
     * @return the expressionHints
     */
    public Set<SearchExpressionHint> getExpressionHints()
    {
        return expressionHints;
    }

    /**
     * @param expressionHints the expressionHints to set
     */
    public void setExpressionHints(Set<SearchExpressionHint> expressionHints)
    {
        this.expressionHints = expressionHints;
    }

    /**
     * @return the facesContext
     */
    public FacesContext getFacesContext()
    {
        return facesContext;
    }

}