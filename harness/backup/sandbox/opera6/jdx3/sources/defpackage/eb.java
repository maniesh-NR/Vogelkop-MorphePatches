package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.history.HistoryManager;
import com.opera.android.history.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.google_apis.gaia.GaiaId;
import org.chromium.google_apis.gaia.GoogleServiceAuthError;
import org.chromium.media.MediaDrmStorageBridge$PersistentInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class eb implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ eb(jb jbVar, CoreAccountInfo coreAccountInfo, String str, hp2 hp2Var) {
        this.a = (byte) 0;
        this.b = jbVar;
        this.c = hp2Var;
    }

    public /* synthetic */ eb(jb jbVar, CoreAccountInfo coreAccountInfo, s14 s14Var) {
        this.a = (byte) 1;
        this.b = jbVar;
        this.c = coreAccountInfo;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                jb jbVar = (jb) obj3;
                jbVar.getClass();
                jbVar.c();
                N.MTN9MD0o((Object) null, 0L, new GoogleServiceAuthError(2), ((hp2) obj2).b);
                jbVar.e();
                break;
            case 1:
                GaiaId gaiaId = ((CoreAccountInfo) obj2).c;
                ((jb) obj3).c();
                break;
            case 2:
                new ldj((Context) obj3, ".png", (byte[]) obj, new j12((com.opera.api.Callback) obj2, (byte) 0)).execute(new Void[0]);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                int i = BrowserActivity.E1;
                ((tt2) obj3).run(bool);
                b2l b2lVarW0 = ((BrowserActivity) obj2).w0();
                if (bool.booleanValue() && b2lVarW0 != null) {
                    ((d7l) b2lVarW0).o();
                    break;
                }
                break;
            case 4:
                e eVar = (e) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                HistoryManager.NativeHistoryEntry[] nativeHistoryEntryArr = (HistoryManager.NativeHistoryEntry[]) obj;
                if (eVar.j != null) {
                    eVar.f.r(nativeHistoryEntryArr);
                    eVar.h.r(arrayList);
                    break;
                }
                break;
            case 5:
                x77 x77Var = (x77) obj3;
                nid nidVar = (nid) obj2;
                MediaDrmStorageBridge$PersistentInfo mediaDrmStorageBridge$PersistentInfo = (MediaDrmStorageBridge$PersistentInfo) obj;
                x77Var.getClass();
                if (mediaDrmStorageBridge$PersistentInfo != null) {
                    byte[] bArr = mediaDrmStorageBridge$PersistentInfo.a;
                    zid zidVar = new zid(bArr, (byte[]) null, mediaDrmStorageBridge$PersistentInfo.b);
                    String str = mediaDrmStorageBridge$PersistentInfo.c;
                    int i2 = mediaDrmStorageBridge$PersistentInfo.d;
                    ((HashMap) x77Var.b).put(ByteBuffer.wrap(bArr), new ajd(zidVar, str, (i2 == 2 || i2 == 3) ? i2 : 2));
                    nidVar.onResult(zidVar);
                    break;
                } else {
                    nidVar.onResult((Object) null);
                    break;
                }
            default:
                vsi vsiVar = (vsi) obj3;
                SimpleUrlLoader simpleUrlLoader = (SimpleUrlLoader) obj2;
                ((Integer) obj).getClass();
                if (vsiVar.c == simpleUrlLoader) {
                    vsiVar.c = null;
                    if (vsiVar.b == 2) {
                        vsiVar.b = 3;
                    }
                    int i3 = vsiVar.f;
                    if (i3 == 0) {
                        vsiVar.g = 200L;
                    } else {
                        long j = vsiVar.g;
                        if (j < 4611686018427387903L) {
                            vsiVar.g = j << 1;
                        }
                    }
                    vsiVar.f = i3 + 1;
                    tsi tsiVar = vsiVar.d;
                    if (tsiVar != null) {
                        tsiVar.c.L(Collections.EMPTY_LIST);
                    }
                    vsiVar.d = null;
                    vsiVar.c(true);
                    break;
                }
                break;
        }
    }
}
