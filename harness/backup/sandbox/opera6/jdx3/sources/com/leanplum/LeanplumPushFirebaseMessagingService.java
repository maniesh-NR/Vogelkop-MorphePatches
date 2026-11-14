package com.leanplum;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public class LeanplumPushFirebaseMessagingService extends FirebaseMessagingService {
    private final LeanplumFirebaseServiceHandler handler = new LeanplumFirebaseServiceHandler();

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        super/*android.app.Service*/.onCreate();
        this.handler.onCreate(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(@NonNull rth rthVar) {
        this.handler.onMessageReceived(rthVar, getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(@NonNull String str) {
        this.handler.onNewToken(str, getApplicationContext());
    }
}
