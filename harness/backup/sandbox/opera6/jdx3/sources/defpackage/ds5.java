package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class ds5 implements es5, ls5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d5o b;

    public /* synthetic */ ds5(d5o d5oVar, byte b) {
        this.a = b;
        this.b = d5oVar;
    }

    @Override // defpackage.es5
    public final void a(Uri uri, String str) {
        byte b = this.a;
        d5o d5oVar = this.b;
        switch (b) {
            case 0:
                cmn cmnVar = new cmn(null, uri.toString(), 0, 5, false);
                ((gjm) d5oVar.b).e(new dmn((wln) ((k73) d5oVar.c).f, cmnVar), false);
                break;
            case 1:
            default:
                ((jv0) ((k73) d5oVar.c).e).j(Collections.singletonList(new u92(uri, o29.IMAGE, "", "")), x92.a);
                break;
            case 2:
                new ghf(new i4d(new vvf(uri, str, (byte) 19))).I((Context) d5oVar.a);
                break;
        }
    }

    @Override // defpackage.ls5
    public final void e(int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        new ldj((Context) this.b.a, ".png", bArr, new vk2((byte) 9)).execute(new Void[0]);
    }
}
