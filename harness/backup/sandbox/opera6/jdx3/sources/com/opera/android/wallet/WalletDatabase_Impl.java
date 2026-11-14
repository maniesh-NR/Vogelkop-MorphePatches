package com.opera.android.wallet;

import defpackage.sin;
import defpackage.sv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WalletDatabase_Impl extends WalletDatabase {
    public volatile sin I;

    public final pjb e() {
        return new pjb(this, new HashMap(0), new HashMap(0), new String[]{"wallets", "accounts", "tokens", "tokens_info", "collectibles", "transactions", "favorites", "deposits"});
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
        map.put(sin.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.opera.android.wallet.WalletDatabase
    public final sin x() {
        sin sinVar;
        if (this.I != null) {
            return this.I;
        }
        synchronized (this) {
            if (this.I == null) {
                this.I = new sin(this);
            }
            sinVar = this.I;
        }
        return sinVar;
    }
}
