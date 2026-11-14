package defpackage;

import J.N;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.opera.android.downloads.DownloadJobService;
import com.opera.android.webcore.WebcoreRpcBridge;
import com.opera.api.Callback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class tu implements Callback, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new nr9(1, (ode) obj, ode.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
            case 1:
                return new nr9(1, (xt5) obj, xt5.class, "setBitmap", "setBitmap(Landroid/graphics/Bitmap;)V", 0);
            case 2:
                return (yo7) obj;
            case 3:
                return new nr9(1, (c47) obj, c47.class, "report", "report(Ljava/util/List;)V", 0);
            case 4:
                return new nr9(1, (DownloadJobService) obj, DownloadJobService.class, "updateNotification", "updateNotification(Landroid/app/Notification;)V", 0);
            case 5:
                return (rmg) obj;
            case 6:
                return new nr9(1, (r9i) obj, r9i.class, "transferRequestToWeb", "transferRequestToWeb(Ljava/lang/String;)V", 0);
            case 7:
                return new nr9(1, (s9i) obj, s9i.class, "transferRequestToWeb", "transferRequestToWeb(Ljava/lang/String;)V", 0);
            case 8:
                return new nr9(1, (vqi) obj, vqi.class, "onDataUpdated", "onDataUpdated(Ljava/util/List;)V", 0);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new nr9(1, (xl2) obj, xl2.class, "onFinished", "onFinished(Landroid/graphics/drawable/Drawable;)V", 0);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new nr9(1, (qwk) obj, qwk.class, "checkSyncPasswordsStatus", "checkSyncPasswordsStatus(Z)V", 0);
            case 11:
                return (n6k) obj;
            case 12:
                return new nr9(1, (pjn) obj, pjn.class, "onBitmapLoaded", "onBitmapLoaded(Landroid/graphics/Bitmap;)V", 0);
            case 13:
                return new nr9(1, (lqn) obj, lqn.class, "pickCameraOnError", "pickCameraOnError(Lcom/opera/android/webaiassistant/WebAiAssistantViewModel$CameraError;)V", 0);
            case 14:
                return new nr9(1, (mqn) obj, lqn.class, "pickCameraOnError", "pickCameraOnError(Lcom/opera/android/webaiassistant/WebAiAssistantViewModel$CameraError;)V", 0);
            default:
                return (lz8) obj;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ode) obj2).r((List) obj);
                break;
            case 1:
                ((xt5) obj2).U((Bitmap) obj);
                break;
            case 2:
                ((yo7) obj2).invoke(obj);
                break;
            case 3:
                List list = (List) obj;
                x5f x5fVar = ((c47) obj2).b;
                Object obj3 = list.get(0);
                z37 z37Var = z37.b;
                boolean z = obj3 == z37Var;
                boolean z2 = list.get(1) == z37Var;
                boolean z3 = list.get(2) == z37Var;
                boolean z4 = list.get(3) == z37Var;
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                rr0 rr0VarL = x56VarF.L(zpaVar);
                rr0VarL.r(22, 1, z);
                rr0VarL.r(21, 1, z2);
                rr0VarL.r(23, 1, z3);
                rr0VarL.r(24, 1, z4);
                x5fVar.U0(x56VarF);
                break;
            case 4:
                int i = DownloadJobService.d;
                ((DownloadJobService) obj2).b((Notification) obj);
                break;
            case 5:
                ((rmg) obj2).invoke(obj);
                break;
            case 6:
                String str = (String) obj;
                long j = ((WebcoreRpcBridge) ((r9i) obj2).d).a;
                if (j != 0) {
                    N.MM1UajSt(j, str);
                    break;
                }
                break;
            case 7:
                String str2 = (String) obj;
                long j2 = ((WebcoreRpcBridge) ((s9i) obj2).d).a;
                if (j2 != 0) {
                    N.MM1UajSt(j2, str2);
                    break;
                }
                break;
            case 8:
                ((vqi) obj2).f.r((List) obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((xl2) obj2).c((Drawable) obj);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((qwk) obj2).D(((Boolean) obj).booleanValue());
                break;
            case 11:
                ((n6k) obj2).invoke(obj);
                break;
            case 12:
                pjn pjnVar = (pjn) obj2;
                qjn qjnVar = (qjn) pjnVar.b;
                qjnVar.g = (Bitmap) obj;
                qjnVar.h = new cnn(qjnVar);
                pjnVar.n();
                break;
            case 13:
                ((lqn) obj2).J0((xrn) obj);
                break;
            case 14:
                ((mqn) obj2).J0((xrn) obj);
                break;
            default:
                ((lz8) obj2).invoke(obj);
                break;
        }
    }
}
