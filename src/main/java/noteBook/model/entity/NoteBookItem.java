package noteBook.model.entity;

import noteBook.controller.InputRegForm;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class NoteBookItem {
    private Name name;
    private String nickname;
    private String comment;
    private String group;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String mobilePhoneNumber2;
    private String email;
    private String skype;
    private String index;
    private Address address;
    private String createData;
    private String modifyData;

    public NoteBookItem() {
        Name name = new Name(InputRegForm.getName(),InputRegForm.getSurname(),InputRegForm.getPatronymic());
        this.name = name;
        Address adress = new Address (InputRegForm.getIndex(),InputRegForm.getCity(), InputRegForm.getStreet(),InputRegForm.getBuilding(),
                InputRegForm.getApartment());
        this.address = adress;
        this.nickname = InputRegForm.getNickname();
        this.comment = InputRegForm.getComment();
        this.group = InputRegForm.getGroup();
        this.homePhoneNumber = InputRegForm.getHomePhoneNumber();
        this.mobilePhoneNumber = InputRegForm.getMobilePhoneNumber();
        this.mobilePhoneNumber2 = InputRegForm.getMobilePhoneNumber2();
        this.email = InputRegForm.getEmail();
        this.skype = InputRegForm.getSkype();
        this.index = InputRegForm.getIndex();
        this.createData = InputRegForm.getCreateData();
        this.modifyData = InputRegForm.getModifyData();

    }


    @Override
    public String toString() {
        return "NoteBookItem{" +
                "name=" + name +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group='" + group + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", mobilePhoneNumber2='" + mobilePhoneNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", index='" + index + '\'' +
                ", address=" + address +
                ", createData='" + createData + '\'' +
                ", modifyData='" + modifyData + '\'' +
                '}';
    }
}
