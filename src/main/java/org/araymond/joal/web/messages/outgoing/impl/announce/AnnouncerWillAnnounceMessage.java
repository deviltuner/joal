package org.araymond.joal.web.messages.outgoing.impl.announce;

import com.google.common.base.Preconditions;
import org.araymond.joal.core.ttorent.client.MockedTorrent;
import org.araymond.joal.core.ttorent.client.bandwidth.TorrentWithStats;
import org.araymond.joal.web.messages.outgoing.OutgoingMessage;
import org.araymond.joal.web.messages.outgoing.OutgoingMessageTypes;

/**
 * Created by raymo on 25/06/2017.
 */
public class AnnouncerWillAnnounceMessage extends AnnounceMessage {

    public AnnouncerWillAnnounceMessage(final TorrentWithStats torrent) {
        super(OutgoingMessageTypes.ANNOUNCER_WILL_ANNOUNCE, torrent);
    }
}