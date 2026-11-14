package com.opera.android.suggested_sites;

import defpackage.apk;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class SuggestedSitesDatabase_Impl extends SuggestedSitesDatabase {
    public volatile apk r;

    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), new String[]{"metadata", "provider_info", "partner_data", "partner_tree", "domain_data"});
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
        map.put(apk.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.opera.android.suggested_sites.SuggestedSitesDatabase
    public final apk x() {
        apk apkVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new apk(this);
            }
            apkVar = this.r;
        }
        return apkVar;
    }
}
