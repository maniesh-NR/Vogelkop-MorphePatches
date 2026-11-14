package com.opera.android.touch;

import com.leanplum.internal.Constants;
import defpackage.jvd;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class MessageDatabase_Impl extends MessageDatabase {
    public volatile jvd o;

    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), new String[]{Constants.Keys.MESSAGES});
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
        map.put(jvd.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.opera.android.touch.MessageDatabase
    public final jvd x() {
        jvd jvdVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new jvd(this);
            }
            jvdVar = this.o;
        }
        return jvdVar;
    }
}
