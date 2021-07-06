package com.dao.personalInformation;

import com.po.PersonalInformation0308;
import com.po.User;

public interface PersonalInformationDao0308 {
    boolean insertAllInformation (PersonalInformation0308 personalInformation0308);
    PersonalInformation0308 selectInformationBYUID(User user);
    boolean updateInformationBYUID(PersonalInformation0308 personalInformation0308);
}
