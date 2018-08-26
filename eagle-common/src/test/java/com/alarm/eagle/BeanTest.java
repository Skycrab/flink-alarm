package com.alarm.eagle;

import com.alarm.eagle.bean.Policy;
import com.alarm.eagle.constants.AlertConstant.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by skycrab on 18/1/9.
 */
public class BeanTest {
    @Test
    public void testPolicy() {
        Policy policy = new Policy();
        policy.setPolicyId(1);

        Policy policy2 = new Policy();

        Assert.assertFalse(policy.equals(policy2));
        policy2.setPolicyId(1);
        Assert.assertTrue(policy.equals(policy2));
    }

    @Test
    public void testAlertType() {
        AlertType alertType = AlertType.resolve(1);
        Assert.assertEquals(alertType, AlertType.HttpCallback);

        List<AlertType> alertTypeList = AlertType.resolveAll(1);
        Assert.assertEquals(alertTypeList.size(), 1);

        List<AlertType> alertTypeList2 = AlertType.resolveAll(3);
        Assert.assertEquals(alertTypeList2.size(), 2);

        System.out.println(alertTypeList2);
    }
}
