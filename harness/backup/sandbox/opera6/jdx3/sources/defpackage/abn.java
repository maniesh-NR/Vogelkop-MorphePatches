package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class abn implements hh4, RecognitionListener {
    public final Function1 a;
    public boolean b;
    public boolean c;
    public final kze d = new kze(Boolean.FALSE);
    public final ode e = new ode((Object) null);
    public final ode f = new ode((Object) null);
    public final SpeechRecognizer g;

    public abn(Context context, Function1 function1) {
        this.a = function1;
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this);
        this.g = speechRecognizerCreateSpeechRecognizer;
    }

    public final void a() {
        this.c = true;
        this.g.destroy();
    }

    public final void b(hbn hbnVar) {
        if (this.b || this.c) {
            return;
        }
        this.a.invoke(hbnVar);
    }

    @Override // defpackage.hh4
    public final void cancel() {
        if (this.b) {
            return;
        }
        this.g.cancel();
        b(cbn.a);
        this.b = true;
        a();
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        this.d.r(Boolean.TRUE);
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        this.d.r(Boolean.FALSE);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        zan zanVar;
        switch (i) {
            case 1:
            case 2:
                zanVar = zan.e;
                break;
            case 3:
            case 5:
            case 8:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            default:
                zanVar = zan.g;
                break;
            case 4:
            case 11:
                zanVar = zan.f;
                break;
            case 6:
            case 7:
                zanVar = zan.a;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                zanVar = zan.d;
                break;
            case 12:
                zanVar = zan.c;
                break;
            case 13:
                zanVar = zan.e;
                break;
        }
        b(new fbn(zanVar));
        a();
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onLanguageDetection(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String str = stringArrayList != null ? (String) CollectionsKt.firstOrNull(stringArrayList) : null;
        if (str == null) {
            str = "";
        }
        this.f.r(str);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        b(new bbn(this.d, this.e, this.f));
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String str = stringArrayList != null ? (String) CollectionsKt.firstOrNull(stringArrayList) : null;
        if (str == null) {
            str = "";
        }
        this.f.r(str);
        b(new ebn(str));
        a();
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.e.r(Float.valueOf(f));
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
    }
}
