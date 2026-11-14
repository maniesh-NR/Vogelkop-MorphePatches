package defpackage;

import J.N;
import android.content.res.Resources;
import com.google.android.material.chip.Chip;
import com.leanplum.LeanplumPushService;
import com.leanplum.utils.SizeUtil;
import java.util.List;
import java.util.function.Consumer;
import org.chromium.base.PowerMonitor;
import org.chromium.media.AudioManagerAndroid;

/* loaded from: classes.dex */
public final /* synthetic */ class qg2 implements Consumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ qg2(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                hsh hshVar = AudioManagerAndroid.o;
                N.MITBBOjF(((Boolean) obj).booleanValue());
                break;
            case 1:
                sz8 sz8Var = (sz8) obj;
                tyn tynVar = sz8Var.d;
                if (tynVar != null) {
                    tynVar.M();
                    sz8Var.d = null;
                    break;
                }
                break;
            case 2:
                ((c35) obj).a(false);
                break;
            case 3:
                ((c35) obj).a(true);
                break;
            case 4:
                ((o35) obj).b.setChecked(true);
                break;
            case 5:
                ((o35) obj).b.setChecked(false);
                break;
            case 6:
                ((Chip) obj).setVisibility(0);
                break;
            case 7:
                ((Chip) obj).setVisibility(8);
                break;
            case 8:
                LeanplumPushService.addExternallyManagedChannel((String) obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((Runnable) obj).run();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((q9g) obj).A();
                break;
            case 11:
                PowerMonitor.c((List) obj);
                break;
            case 12:
                break;
            case 13:
                ((tjp) obj).b();
                break;
            case 14:
                ((tjp) obj).onPause();
                break;
            case 15:
                ((tjp) obj).d();
                break;
            case 16:
                ((tjp) obj).a$1();
                break;
            case 17:
                ((tjp) obj).c();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((tjp) obj).onResume();
                break;
            case 19:
                ((tjp) obj).onStop();
                break;
            default:
                ((tjp) obj).onDestroy();
                break;
        }
    }
}
