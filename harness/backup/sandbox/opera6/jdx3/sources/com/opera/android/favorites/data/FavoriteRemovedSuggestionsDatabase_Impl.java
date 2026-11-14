package com.opera.android.favorites.data;

import defpackage.al7;
import defpackage.sv0;
import defpackage.ur8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/favorites/data/FavoriteRemovedSuggestionsDatabase_Impl;", "Lcom/opera/android/favorites/data/FavoriteRemovedSuggestionsDatabase;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavoriteRemovedSuggestionsDatabase_Impl extends FavoriteRemovedSuggestionsDatabase {
    public final zyk l = z4c.b(new al7((Object) this, (byte) 5));

    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final pjb e() {
        return new pjb(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"add_favorite_removed_suggestion"});
    }

    public final c6i f() {
        return new sv0(this);
    }

    public final Set j() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(uqh.a(ur8.class), l08.a);
        return linkedHashMap;
    }

    @Override // com.opera.android.favorites.data.FavoriteRemovedSuggestionsDatabase
    public final ur8 x() {
        return (ur8) this.l.getValue();
    }
}
