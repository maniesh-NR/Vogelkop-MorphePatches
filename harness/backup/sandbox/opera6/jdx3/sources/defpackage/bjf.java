package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.autofill.SaveCallback;
import android.service.autofill.SaveRequest;
import android.view.autofill.AutofillId;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import com.opera.android.autofill.OperaAutofillService;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class bjf implements Callback {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ bjf(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final void a(boolean z) {
        orm ormVar = (orm) this.d;
        ijm ijmVar = ijm.b;
        if (z) {
            ysj ysjVar = (ysj) this.b;
            w0a w0aVar = new w0a((byte) 3);
            ysjVar.getClass();
            ysjVar.b(w0aVar, ijmVar);
            ((x5f) ormVar).S(21);
            return;
        }
        z77 z77Var = (z77) this.c;
        wen wenVar = new wen((e6g) this.e, (byte) 4);
        z77Var.getClass();
        z77Var.b(wenVar, ijmVar);
        ((x5f) ormVar).R(19, "Failed export");
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                tw7 tw7Var = (tw7) obj;
                SaveCallback saveCallback = (SaveCallback) this.e;
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        OperaAutofillService operaAutofillService = (OperaAutofillService) this.b;
                        int i = OperaAutofillService.d;
                        x77 x77Var = new x77((rye) operaAutofillService.c.get(), ((OperaApplication) ((xu2) operaAutofillService.a.getValue())).f(), new zif(operaAutofillService, (byte) 1), false, (byte) 11);
                        SaveRequest saveRequest = (SaveRequest) this.c;
                        SaveCallback saveCallback2 = (SaveCallback) this.d;
                        Bundle clientState = saveRequest.getClientState();
                        String string = clientState != null ? clientState.getString("com.opera.android.autofill.EXTRA_DOMAIN") : null;
                        if (string != null) {
                            ArrayList arrayListK = x77Var.k(saveRequest.getFillContexts());
                            ArrayList arrayList = new ArrayList();
                            int size = arrayListK.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = arrayListK.get(i2);
                                i2++;
                                o95.t(((g39) obj2).a, arrayList);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                o95.t(e82.B(((k2g) obj3).b()), arrayList2);
                            }
                            CharSequence charSequenceL = u0h.l(arrayList2, clientState != null ? (AutofillId) ((Parcelable) j14.T(clientState, "com.opera.android.autofill.EXTRA_USER_FIELD_ID", AutofillId.class)) : null);
                            CharSequence charSequenceL2 = u0h.l(arrayList2, clientState != null ? (AutofillId) ((Parcelable) j14.T(clientState, "com.opera.android.autofill.EXTRA_PASSWORD_FIELD_ID", AutofillId.class)) : null);
                            if (charSequenceL2 != null) {
                                List<String> datasetIds = saveRequest.getDatasetIds();
                                if (datasetIds == null || (str = (String) CollectionsKt.R(datasetIds)) == null || str.length() <= 0) {
                                    str = null;
                                }
                                s3g s3gVar = new s3g(str, string, string, charSequenceL != null ? charSequenceL.toString() : null, charSequenceL2.toString());
                                int i4 = OperaAutofillIntentDispatcherActivity.i;
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("com.opera.android.autofill.EXTRA_SAVE_DATA", s3gVar);
                                saveCallback2.onSuccess(PendingIntent.getActivity(operaAutofillService, 0, new Intent(operaAutofillService, (Class<?>) OperaAutofillIntentDispatcherActivity.class).setAction("com.opera.android.autofill.ACTION_SAVE_PASSWORD").putExtra("com.opera.android.autofill.EXTRA_BUNDLE", bundle).addFlags(1073741824).addFlags(8388608).addFlags(65536), 301989888).getIntentSender());
                                break;
                            } else {
                                saveCallback2.onFailure("");
                                break;
                            }
                        } else {
                            saveCallback2.onFailure("");
                            break;
                        }
                    }
                } else {
                    int iOrdinal = ((jd6) ((rw7) tw7Var).a).ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            h9o.p();
                            break;
                        } else {
                            str2 = "A new request has been made, this callback is outdated.";
                        }
                    } else {
                        str2 = "DataSourceFactory is not initialized yet.";
                    }
                    saveCallback.onFailure(str2);
                    break;
                }
                break;
            default:
                a(((Boolean) obj).booleanValue());
                break;
        }
    }
}
