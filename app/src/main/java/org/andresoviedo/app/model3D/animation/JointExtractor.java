package org.andresoviedo.app.model3D.animation;

import android.opengl.Matrix;
import android.util.Log;

import org.andresoviedo.app.model3D.model.AnimatedModel;
import org.andresoviedo.app.model3D.model.Object3DData;
import org.andresoviedo.app.model3D.services.collada.entities.Joint;

import java.nio.FloatBuffer;

//Written by Ishara
public class JointExtractor extends Object3DData {
    // skeleton
    private Joint rootJoint;
    private int jointCount;
    private FloatBuffer jointIds;
    private FloatBuffer vertexWeigths;
    private Animation animation;

    private String TAG = "JOINTEXTRACTOR";

    public JointExtractor(FloatBuffer vertexArrayBuffer) {
        super(vertexArrayBuffer);
    }

    public JointExtractor setRootJoint(Joint rootJoint, int jointCount) {
        this.rootJoint = rootJoint;
        this.jointCount = jointCount;
        float[] parentTransform = new float[16];
        Matrix.setIdentityM(parentTransform,0);
        rootJoint.calcInverseBindTransform(parentTransform);
        Log.d(TAG,"");
        return this;
    }

    public float[][] getJointTransforms() {
        float[][] jointMatrices = new float[jointCount][16];
        for (int i=0; i<jointMatrices.length;i++){
            Matrix.setIdentityM(jointMatrices[i],0);
        }
        addJointsToArray(rootJoint, jointMatrices);
        return jointMatrices;
    }
    private void addJointsToArray(Joint headJoint, float [][] jointMatrices) {
        jointMatrices[headJoint.index] = headJoint.getAnimatedTransform();
        for (Joint childJoint : headJoint.children) {
            addJointsToArray(childJoint, jointMatrices);
        }
    }
}
