package com.opera.android.history;

import com.opera.android.browser.BrowserUtils;
import com.opera.android.history.HistoryManager;
import com.opera.android.history.g;
import defpackage.aca;
import defpackage.j4c;
import defpackage.utn;
import defpackage.vtn;
import defpackage.wtn;
import defpackage.zda;

/* loaded from: classes.dex */
public final class g extends vtn implements aca {
    public final c a;
    public final HistoryManager.NativeHistoryEntry b;
    public final String c;
    public final j4c d;
    public final j4c e;
    public wtn f;

    public g(c cVar) {
        this.a = cVar;
        HistoryManager.NativeHistoryEntry nativeHistoryEntry = cVar.a;
        this.b = nativeHistoryEntry;
        this.c = nativeHistoryEntry.a();
        final byte b = 0;
        final byte b2 = 1;
        this.d = new j4c(new esk(this) { // from class: xtn
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b3 = b;
                g gVar = this.b;
                switch (b3) {
                    case 0:
                        return BrowserUtils.getEditableString(gVar.b.getUrl());
                    default:
                        return gVar.b.getTitle();
                }
            }
        }, (byte) 1);
        this.e = new j4c(new esk(this) { // from class: xtn
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b3 = b2;
                g gVar = this.b;
                switch (b3) {
                    case 0:
                        return BrowserUtils.getEditableString(gVar.b.getUrl());
                    default:
                        return gVar.b.getTitle();
                }
            }
        }, (byte) 1);
    }

    @Override // defpackage.aca
    public final zda a() {
        return this.a;
    }

    @Override // defpackage.vtn
    public final String b() {
        return this.c;
    }

    @Override // defpackage.vtn
    public final long c() {
        return this.b.getId();
    }

    @Override // defpackage.vtn
    public final utn d() {
        return utn.c;
    }

    @Override // defpackage.vtn
    public final void e() {
        this.f = null;
    }
}
