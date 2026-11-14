package com.opera.android.live_score.data.db;

import defpackage.sv0;
import defpackage.wlc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class LiveScoreDatabase_Impl extends LiveScoreDatabase {
    public volatile wlc z;

    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), new String[]{"football_events", "notifications", "followed_matches", "followed_teams", "followed_tournaments", "event_odds", "odds_provider_config", "football_audio_commentary"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final List h() {
        return new ArrayList();
    }

    public final Set k() {
        return new HashSet();
    }

    public final Map m() {
        HashMap map = new HashMap();
        map.put(wlc.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.opera.android.live_score.data.db.LiveScoreDatabase
    public final wlc x() {
        wlc wlcVar;
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            if (this.z == null) {
                this.z = new wlc(this);
            }
            wlcVar = this.z;
        }
        return wlcVar;
    }
}
