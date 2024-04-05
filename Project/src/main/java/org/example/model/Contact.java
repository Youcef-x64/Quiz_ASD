package org.example.model;

import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String companyName;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String companyName, String jobTitle, List<Phone> phones, List<Email> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.phones = phones;
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public String toJson() {
        StringBuilder phonesStrBuilder = new StringBuilder();

        if (phones != null) {
            Phone phone;
            for (int i = 0; i < phones.size(); i++) {
                phone = phones.get(i);

                phonesStrBuilder.append(phone.toJson());

                if (i != phones.size() - 1)
                    phonesStrBuilder.append(",");
            }
        }

        StringBuilder emailsStrBuilder = new StringBuilder();

        if (emails != null) {
            Email email;
            for (int i = 0; i < emails.size(); i++) {
                email = emails.get(i);

                emailsStrBuilder.append(email.toJson());

                if (i != emails.size() - 1)
                    emailsStrBuilder.append(",");
            }
        }


        return String.format("{firstName: \"%s\", lastName: \"%s\", companyName: \"%s\", jobTitle: \"%s\"" +
                ", phones: [%s], emails: [%s]}", firstName, lastName, companyName, jobTitle,
                phonesStrBuilder.toString(), emailsStrBuilder.toString());
    }

}
