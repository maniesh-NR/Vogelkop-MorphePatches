package defpackage;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaRouter2;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class kg1 {
    public static ix9 a(GetTopicsResponse getTopicsResponse) {
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new zvl(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new ix9(arrayList, l08.a);
    }

    public static ix9 b(GetTopicsResponse getTopicsResponse) {
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new zvl(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            arrayList2.add(new u28(encryptedTopic.getEncryptedTopic(), encryptedTopic.getKeyIdentifier(), encryptedTopic.getEncapsulatedKey()));
        }
        return new ix9(arrayList, arrayList2);
    }

    public static final void c(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static final List d(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final int e(ge4 ge4Var) {
        Integer num = (Integer) ((ma4) ge4Var).c(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static long f(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.getLastChangedRowCount();
    }

    public static final int g(ge4 ge4Var) {
        Integer num = (Integer) ((ma4) ge4Var).c(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static int h(MediaRouter2.RoutingController routingController) {
        int transferReason = routingController.getRoutingSessionInfo().getTransferReason();
        if (transferReason == 2) {
            return 1;
        }
        if (transferReason == 1) {
            return 2;
        }
        return transferReason == 0 ? 3 : 0;
    }

    public static final boolean i(ge4 ge4Var) {
        Integer num = (Integer) ((ma4) ge4Var).c(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return num != null && num.intValue() > 1;
    }

    public static final void j(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
    }

    public static void k(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void l(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
