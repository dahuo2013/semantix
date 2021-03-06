/* 
 * Copyright 2015 Coastal and Marine Research Centre (CMRC), Beaufort,
 * Environmental Research Institute (ERI), University College Cork (UCC).
 * Yassine Lassoued <y.lassoued@gmail.com, y.lassoued@ucc.ie>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ie.cmrc.smtx.skos.jena.util.impl;

import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import ie.cmrc.smtx.skos.jena.util.JenaResourceIterator;

/**
 * {@link ie.cmrc.skos.core.jena.util.JenaResourceIterator} over the subjects of
 * the elements of a Jena statement iterator ({@code com.hp.hpl.jena.rdf.model.StmtIterator})
 * @author Yassine Lassoued
 */
public class StmtSubjectIterator implements JenaResourceIterator {
    
    /**
     * {@code com.hp.hpl.jena.rdf.model.StmtIterator} to wrap
     */
    private StmtIterator iter;

    /**
     * Creates a {@link ie.cmrc.skos.core.jena.util.JenaResourceIterator} over the subjects of
     * the elements of the provided Jena statement iterator ({@code com.hp.hpl.jena.rdf.model.StmtIterator})
     * @param iter {@code com.hp.hpl.jena.rdf.model.StmtIterator} to wrap as a
     * {@link ie.cmrc.skos.core.jena.util.JenaResourceIterator}
     */
    public StmtSubjectIterator(StmtIterator iter) {
        this.iter = iter;
    }
    
    /**
     * Checks whether the iterator has more elements
     * @return {@code true} if the iterator has more elements, {@code false} otherwise
     */
    @Override
    public boolean hasNext() {
        return (this.iter!=null && this.iter.hasNext());
    }

    /**
     * Returns the next element of the iterator
     * @return Next element of the iterator
     */
    @Override
    public Resource next() {
        if (this.hasNext()) {
            Statement stmt = iter.next();
            return stmt.getSubject();
        }
        else return null;
    }

    /**
     * Removes the current element of the iterator
     */
    @Override
    public void remove() {
        if (this.iter != null) this.iter.remove();
    }

    /**
     * Closes the iterator to free up memory resources
     */
    @Override
    public void close() {
        if (this.iter != null) this.iter.close();
    }
}
