package defpackage;

import android.app.Activity;
import android.content.Context;
import com.leanplum.internal.Constants;
import com.opera.android.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ki implements esk, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ki(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (li) obj;
            case 1:
                return (li) obj;
            case 2:
                return new nr9(0, (zv3) obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
            case 3:
                return new nr9(0, (ii) obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
            case 4:
                return new nr9(0, (qim) obj, qim.class, "getSheetQueue", "getSheetQueue()Lcom/opera/android/ui/SheetQueue;", 0);
            case 5:
                return new nr9(0, (u59) obj, u59.class, "getValues", "getValues()Lcom/opera/android/storage/FirstInstallValuesGetter$Values;", 0);
            case 6:
                return new nr9(0, (xnh) obj, xnh.class, Constants.Params.DATA, "data()Ljava/lang/Object;", 0);
            case 7:
                return new nr9(0, (fx3) obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
            case 8:
                return (pw3) obj;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new nr9(0, (Context) obj, Context.class, "getFilesDir", "getFilesDir()Ljava/io/File;", 0);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new nr9(0, (x7j) obj, x7j.class, "settingsSearchRepository", "settingsSearchRepository()Lcom/opera/android/settings/settings_search/SettingsSearchRepository;", 0);
            case 11:
                return new nr9(0, (mrk) obj, mrk.class, "getPayload", "getPayload()Lcom/opera/android/WebSearchPayload;", 0);
            default:
                return (vk1) obj;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof esk) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((li) obj).get();
            case 1:
                return ((li) obj).get();
            case 2:
                return (cg2) ((zv3) obj).get();
            case 3:
                return (y22) ((ii) obj).get();
            case 4:
                return ((qim) obj).d;
            case 5:
                return ((u59) obj).H();
            case 6:
                return (wnh) ((xnh) obj).i();
            case 7:
                return (gjm) ((fx3) obj).get();
            case 8:
                return ((pw3) obj).get();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((Context) obj).getFilesDir();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                x7j x7jVar = (x7j) obj;
                Activity activity = (Activity) x7jVar.b;
                return new a21(activity, new w6j(activity, (z7j) x7jVar.f, (wub) ((mw3) x7jVar.e).get(), (rii) ((mw3) x7jVar.c).get(), (lw3) x7jVar.d));
            case 11:
                ((l0a) ((mrk) obj).o.e.g()).getClass();
                return null;
            default:
                return ((vk1) obj).invoke();
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
