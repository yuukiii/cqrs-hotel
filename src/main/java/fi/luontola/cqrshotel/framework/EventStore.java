// Copyright © 2016 Esko Luontola
// This software is released under the Apache License 2.0.
// The license text is at http://www.apache.org/licenses/LICENSE-2.0

package fi.luontola.cqrshotel.framework;

import java.util.List;
import java.util.UUID;

public interface EventStore {

    int NEW_STREAM = 0;

    List<Event> getEventsForStream(UUID streamId);

    void saveEvents(UUID streamId, List<Event> newEvents, int expectedVersion);
}