package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.opera.android.BrowserActivity;
import com.opera.android.autofill.PasswordImporter;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class g2b implements ni {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2b(buj bujVar, tn tnVar, Uri uri) {
        this.a = (byte) 3;
        this.b = bujVar;
        this.c = tnVar;
    }

    public /* synthetic */ g2b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context, com.opera.android.BrowserActivity, dx3] */
    @Override // defpackage.ni
    public final void a(int i, Intent intent) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                d2b d2bVar = (d2b) obj2;
                h2b h2bVar = (h2b) obj;
                if (i == -1 && intent != null && intent.getData() != null) {
                    d2bVar.invoke();
                    if ((intent.getFlags() & 1) == 1) {
                        Uri data = intent.getData();
                        Context context = t8.a;
                        context.getContentResolver().takePersistableUriPermission(data, 1);
                        vml.d.c(new gl6((Object) h2bVar, (Object) context, (Object) data, (byte) 23)).a(null);
                        break;
                    } else {
                        h2bVar.f("");
                        break;
                    }
                }
                break;
            case 1:
                f3b f3bVar = (f3b) obj2;
                h3b h3bVar = (h3b) obj;
                if (i != 0 && intent != null) {
                    f3bVar.invoke();
                    Uri data2 = i == -1 ? intent.getData() : null;
                    i3j i3jVar = new i3j(h3bVar.d, h3bVar.c, h3bVar.e, h3bVar.f);
                    if (data2 == null) {
                        i3jVar.a(0);
                        break;
                    } else {
                        new PasswordImporter(i3jVar).a(data2.toString());
                        break;
                    }
                }
                break;
            case 2:
                y0a y0aVar = (y0a) obj;
                if (!Settings.canDrawOverlays((BrowserActivity) obj2)) {
                    y0aVar.run(Boolean.FALSE);
                    break;
                } else {
                    y0aVar.run(Boolean.TRUE);
                    break;
                }
            default:
                buj bujVar = (buj) obj2;
                tn tnVar = (tn) obj;
                if (i != 0) {
                    bujVar.getClass();
                    buj bujVar2 = (buj) tnVar.d;
                    fp1 fp1Var = bujVar2.a;
                    ?? r11 = bujVar2.a;
                    zhj.a(new juj((Uri) tnVar.b, (Uri) tnVar.c, r11, bujVar2.b, tnVar.a, DisplayUtil.e(fp1Var) || i0l.g(), bujVar2.e), 4099).c(r11);
                    break;
                } else {
                    bujVar.a(2132021576);
                    break;
                }
                break;
        }
    }
}
