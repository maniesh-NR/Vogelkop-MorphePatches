package defpackage;

import J.N;
import com.opera.android.suggestion.SuggestionProviderBridge;
import com.opera.android.sync.SyncedSession;
import com.opera.android.sync.SyncedSessionTab;
import com.opera.android.sync.SyncedSessionWindow;
import java.util.Collections;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class x8l extends SuggestionProviderBridge {
    public final umi d;
    public final k6l e;
    public final byte f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public oml o;

    public x8l(umi umiVar, k6l k6lVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(0);
        this.d = umiVar;
        this.e = k6lVar;
        this.f = (byte) 20;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        oml omlVar = this.o;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        this.o = null;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        SyncedSession[] syncedSessionArr;
        cancel();
        esi esiVar = (str == null || StringsKt.N(str)) ? null : new esi(StringsKt.l0(str.toString()).toString(), Locale.getDefault());
        if (esiVar == null) {
            yv4Var.d(l08.a);
            return;
        }
        ehc ehcVarB = a.b();
        for (b2l b2lVar : Collections.unmodifiableList(this.e.b)) {
            if (((d7l) b2lVar).j.m() == z2) {
                d7l d7lVar = (d7l) b2lVar;
                if (!d7lVar.j.isActive() && !wqm.w(d7lVar.j.getUrl())) {
                    d7l d7lVar2 = (d7l) b2lVar;
                    ehcVarB.add(new u8l(d7lVar2.t(), d7lVar2.j.getUrl(), new sy3(d7lVar2.j.getUrl(), (byte) 2), d7lVar2.j.getId()));
                }
            }
        }
        ehc ehcVarA = a.a(ehcVarB);
        ehc ehcVarB2 = a.b();
        SyncedSession[] syncedSessionArr2 = (SyncedSession[]) N.MENDCTHo();
        int length = syncedSessionArr2.length;
        int i = 0;
        while (i < length) {
            SyncedSessionWindow[] syncedSessionWindowArr = (SyncedSessionWindow[]) N.MD0ZtbWr(syncedSessionArr2[i].a);
            if (syncedSessionWindowArr != null) {
                int length2 = syncedSessionWindowArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    SyncedSessionWindow syncedSessionWindow = syncedSessionWindowArr[i2];
                    SyncedSessionTab[] syncedSessionTabArr = (SyncedSessionTab[]) N.Mn0q_taN(syncedSessionWindow.a, syncedSessionWindow.b);
                    if (syncedSessionTabArr != null) {
                        int length3 = syncedSessionTabArr.length;
                        int i3 = 0;
                        while (i3 < length3) {
                            SyncedSessionTab syncedSessionTab = syncedSessionTabArr[i3];
                            if (wqm.w(syncedSessionTab.c)) {
                                syncedSessionArr = syncedSessionArr2;
                            } else {
                                syncedSessionArr = syncedSessionArr2;
                                ehcVarB2.add(new v8l(syncedSessionTab.e, syncedSessionTab.c));
                            }
                            i3++;
                            syncedSessionArr2 = syncedSessionArr;
                        }
                    }
                    i2++;
                    syncedSessionArr2 = syncedSessionArr2;
                }
            }
            i++;
            syncedSessionArr2 = syncedSessionArr2;
        }
        this.o = new rml(Unit.a, this.d).a(new tmi(this, new mgh(ehcVarA, a.a(ehcVarB2), (byte) 7), esiVar, (byte) 11)).t(new d7k(yv4Var, this, (byte) 25)).l();
    }
}
