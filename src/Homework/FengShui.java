package Homework;
import javax.swing.JOptionPane;

public class FengShui {
    public static void main(String[] args) {
        String phoneNumber = JOptionPane.showInputDialog("Enter your Phone Number");

        // Check if phoneNumber is null or has less than 3 characters
        if (phoneNumber == null || phoneNumber.length() < 3) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid phone number.");
            return; // Exit the program
        }

        String afterSubstring = phoneNumber.substring(3);

        try {
            int divide = Integer.parseInt(afterSubstring);
            int afterDivide = divide % 80;

            switch (afterDivide) {
                case 1:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : រីកចំរើនល្អអាចទទួលបានជ័យជំនះ");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "ធម្មតា : មានលាភមានបង់មិនទទួលផលអ្វីទេ");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : មានភាពរីកចំរើនអ្វីៗអាចសំរេចបានដូចបំណង");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ផ្លូវអនាគតមានឧបសគ្គច្រើនលំបាកវេទនា");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : រកស៊ីមានបានទទួលបានទាំងកិត្តិយសទាំងផលប្រយោជន៍");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : មានសំណាងច្រើនអាចទទួលបានគុណសម្បត្តិធំ");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "ល្អ : មានចិត្តអត់ធ្មត់ពិតជាអាចទទួលបានជោគជ័យដ៏ធំ");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "ល្អ : អាចមានឳកាសទទួលបានជោគជ័យ");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ឯកកោរ គ្មានអ្នកជួយពិបាកទទួលទ្រព្យមកវិញ");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ខាតបង់ទឹកចិត្តនិងកម្លាំងទទេ ខិតខំដោយឥតបានផល");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "ល្អ : មានលំនឹងល្អអ្នកដទៃស្ងើចសរសើរ");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ទន់ខ្សោយធ្វើអ្វីក៏មិនបានសំរេចដែរ");
                    break;
                case 13:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : មានសំណាង់ល្អក្តីសង្ឃឹមច្រើន");
                    break;
                case 14:
                    JOptionPane.showMessageDialog(null, "ធម្មតា : ជ័យជំនះ ឬបរាជ័យពឹងផ្អែកលើការតាំងចិត្តរបស់ខ្លួន");
                    break;
                case 15:
                    JOptionPane.showMessageDialog(null, "ល្អ : ជ័យជំនះច្រើនមានការរីកចំរើន");
                    break;
                case 16:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : អាចសំរេចកិច្ចការធំបានទទួលទាំងកិត្តិយសទាំងផលប្រយោជន៍");
                    break;
                case 17:
                    JOptionPane.showMessageDialog(null, "ល្អ : មានអ្នកធំជួយអាចទទួលបានជោគជ័យ");
                    break;
                case 18:
                    JOptionPane.showMessageDialog(null, "ល្អ : មានភាពរីកចចម្រើននឹងបានសំរេចដូចបំណង");
                    break;
                case 19:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : មិនអាចទទួលបានជោគជ័យដល់ការខ្វល់អ្វីដែលអាចសម្រេចបាន");
                    break;
                case 20:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ខុសគ្នាខាងក្រោយនិងលក្ខណៈផ្តល់អោយពូជជាតិ");
                    break;
                // and so on for cases 21 to 80
                case 21:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : មានគ្មានជួយពិបាកជាមួយអនុប្រយោជន៍");
                    break;
                case 22:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ : ពេលធ្វើសកម្មភាពមានអនុប្រយោជន៍ខ្លាំង");
                    break;
                case 23:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់ : អាចដាក់ប្រកបដោយគុណភាពខ្ពស់");
                    break;
                case 24:
                    JOptionPane.showMessageDialog(null, "ល្អ : បានប្រើប្រាស់យ៉ាងច្រើនដែលទទួលបានគុណសម្បត្តិ");
                    break;
                case 25:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងល្អមានគេជួយ");
                    break;
                case 26:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ណាស់: មានឧបសគ្គច្រើន");
                    break;
                case 27:
                    JOptionPane.showMessageDialog(null, "ល្អ: អាចមានលាភសំណាងនិងជ័យជំនះ");
                    break;
                case 28:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: រាសីឡើងខ្ពស់រកស៊ីមានបាន");
                    break;
                case 29:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: សំណាងល្អនិងអាក្រក់ កើតមានឡើងព្រមគ្នា");
                    break;
                case 30:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: ទទួលបាននូវលាភសំណាងនិងកិត្តិយស");
                    break;
                case 31:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងអាចទទួលជោគជ័យ");
                    break;
                case 32:
                    JOptionPane.showMessageDialog(null, "ល្អ: មានប្រាជ្ញាឈ្លាសវៃមានភាពរីកចម្រើនច្រើន");
                    break;
                case 33:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ណាស់: ជួបឧបសគ្គមិនចេះអស់ពិបាកនឹងទទួលបានជោគជ័យ");
                    break;
                case 34:
                    JOptionPane.showMessageDialog(null, "ធម្មតា: ត្រូវមានលំនឹងចិត្តកុំលោភលន់");
                    break;
                case 35:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: ឧបសគ្គច្រើនតែជួបភាពលំបាក និងក្រខ្សត់");
                    break;
                case 36:
                    JOptionPane.showMessageDialog(null, "ល្អ: ឧបសគ្គអាចក្លាយជាសំណាងធ្វើអ្វីៗអាចបានដូចបំណង");
                    break;
                case 37:
                    JOptionPane.showMessageDialog(null, "ធម្មតា: អាចទទួលបាននូវកិត្តិយសតែពិបាកទទួលនូវលាភសំណាង");
                    break;
                case 38:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: អនាគតភ្លឺស្វាងត្រចះត្រចង់");
                    break;
                case 39:
                    JOptionPane.showMessageDialog(null, "ធម្មតា: មានសំណាងឬឧបសគ្គមានមិនទៀង");
                    break;
                case 40:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងល្អអនាគតល្អហើយភ្លឺស្វាង ត្រចះត្រចង់");
                    break;
                case 41:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: ការរកស៊ីត្រូវខាតបង់");
                    break;
                case 42:
                    JOptionPane.showMessageDialog(null, "ល្អ: បើមានចិត្តអត់ធ្មត់សំណាងអាក្រក់ អាចក្លាយជាមានលាភ");
                    break;
                case 43:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: រឿងអ្វីៗពិបាកសម្រេចដូចបំណងប្រាថ្នា");
                    break;
                case 44:
                    JOptionPane.showMessageDialog(null, "ល្អ: មានសំណាងមានភាពរីកចម្រើន");
                    break;
                case 45:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: ជួបឧបសគ្គ មានលាភសំណាងដូចបំណងនិងដូចប្រាថ្នា");
                    break;
                case 46:
                    JOptionPane.showMessageDialog(null, "ល្អ: ជួបភាពលំបាកនិងឧបសគ្គដ៏ល្អ");
                    break;
                case 47:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: មានឧបសគ្គច្រើនជំនួសទុកដូចបំណង");
                    break;
                case 48:
                    JOptionPane.showMessageDialog(null, "ល្អ: ការរកស៊ីសម្រាប់ពុម្ភអាក្រក់");
                    break;
                case 49:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងកាន់អស់ដែលសិក្សាលំដាប់");
                    break;
                case 50:
                    JOptionPane.showMessageDialog(null, "ល្អ: អាចទទួលបានទូទៅដូចបំណង");
                    break;
                case 51:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ណាស់: មានបញ្ហាស៊ីត្រូវការជំនួយ");
                    break;
                case 52:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានស្នើប្រដាប់ប្រជែងអត់ធ្មត់ទទួលបានចិត្ត");
                    break;
                case 53:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: មានជ័យជំនះបញ្ហាស៊ីត្រូវការជំនួយ");
                    break;
                case 54:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងត្រូវពិបាករឿងសម្រាប់ប្រើប្រាស់");
                    break;
                case 55:
                    JOptionPane.showMessageDialog(null, "ល្អ: មានសំណាងត្រូវបានបង្កើនដូចប្រហែល");
                    break;
                case 56:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ណាស់: មានសំណាងត្រូវមានកិត្តិយសបាន");
                    break;
                case 57:
                    JOptionPane.showMessageDialog(null, "ល្អ: មានសំណាងបានបង្កើនពីមុនដោយមានកិត្តិយស");
                    break;
                case 58:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: មានសំណាងបានបង្កើនពីមុនដោយមានកិត្តិយសបាន");
                    break;
                case 59:
                    JOptionPane.showMessageDialog(null, "អាក្រក់ណាស់: មានសំណាងល្អដែលក៏បានស្នើប្រដាប់ប្រជែងនិងអាចទទួលបានប្រាក់ដូចនឹងចិត្តទៅកាន់ប្រាក់រួមបញ្ចូលពេលខ្លះ");
                    break;
                case 60:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានស្នើប្រដាប់ប្រជែងនិងទទួលបានចិត្តអត់ធ្មត់");
                    break;
                case 61:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 62:
                    JOptionPane.showMessageDialog(null, "អាក្រក់: ទទួលបានចិត្តអត់ធ្មត់ពេលគេមានអនុប្រយោជន៍");
                    break;
                case 63:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: បានប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 64:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: បានចេះបង់ប្រាក់សំរេចត្រូវប្រាក់ច្រើននិងទទួលបានជោគជ័យ");
                    break;
                case 65:
                    JOptionPane.showMessageDialog(null, "ល្អណាស់: បានប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 66:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 67:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 68:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 69:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 70:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 71:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 72:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 73:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 74:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 75:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 76:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 77:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 78:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 79:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                case 80:
                    JOptionPane.showMessageDialog(null, "ល្អ: បានចូលរួមប្រើប្រាស់បទពិសោធន៍ជាច្រើន");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Number");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid number format");
        }
    }
}
