/*
 * Copyright 2014-2015 CyberVision, Inc.
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

package org.kaaproject.kaa.sandbox.web.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class GetLogsPlace extends Place{

    private Place previousPlace;

    public GetLogsPlace() {}

    public GetLogsPlace(Place previousPlace) {
        this.previousPlace = previousPlace;
    }

    public Place getPreviousPlace() {
        if (previousPlace == null) {
            previousPlace = new MainPlace();
        }
        return previousPlace;
    }

    @Prefix(value = "getLogs")
    public static class Tokenizer implements PlaceTokenizer<GetLogsPlace> {

        @Override
        public GetLogsPlace getPlace(String token) {
            return new GetLogsPlace();
        }

        @Override
        public String getToken(GetLogsPlace place) {
            return "";
        }
    }
}