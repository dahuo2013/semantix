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

package ie.cmrc.smtx.sws.request;

/**
 * Enumeration of the SWS request parameters
 * @author Yassine Lassoued <y.lassoued@ucc.ie>
 */
public enum RequestParam {
    
    acceptFormat,
    callback,
    request,
    relationship,
    concept,
    collection,
    conceptScheme,
    responseLanguage,
    rootType,
    relType,
    keyword,
    elementSet,
    transitive,
    field,
    keywordLanguage,
    offset,
    limit;
}
