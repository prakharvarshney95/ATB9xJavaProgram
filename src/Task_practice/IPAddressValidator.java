package Task_practice;

//    Given a string queryIP, return "IPv4" if IP is a valid IPv4 address,
//    "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.
////        A valid IPv4 address is an IP in the form "x1.x2.x3.x4"
// where 0 <= xi <= 255 and xi cannot contain leading zeros.
// For example, "192.168.1.1" and "192.168.1.0"
// are valid IPv4 addresses while "192.168.01.1",
// "192.168.1.00", and "192.168@1.1" are invalid IPv4 addresses.

    public class IPAddressValidator {
        public static String validIPAddress(String queryIP) {
            if (queryIP.contains(".")) {
                return isValidIPv4(queryIP) ? "IPv4" : "Neither";
            } else if (queryIP.contains(":")) {
                return isValidIPv6(queryIP) ? "IPv6" : "Neither";
            } else {
                return "Neither";
            }
        }

        private static boolean isValidIPv4(String ip) {
            String[] parts = ip.split("\\.");
            if (parts.length != 4) return false;

            for (String part : parts) {
                if (part.isEmpty() || part.length() > 3) return false;

                if (part.charAt(0) == '0' && part.length() > 1) return false;

                try {
                    int num = Integer.parseInt(part);
                    if (num < 0 || num > 255) return false;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isValidIPv6(String ip) {
            String[] parts = ip.split(":");
            if (parts.length != 8) return false;

            for (String part : parts) {
                if (part.length() == 0 || part.length() > 4) return false;

                for (char ch : part.toCharArray()) {
                    if (!Character.isDigit(ch) && !(ch >= 'a' && ch <= 'f') && !(ch >= 'A' && ch <= 'F')) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(validIPAddress("192.168.1.1"));  // IPv4
            System.out.println(validIPAddress("192.168.01.1")); // Neither
            System.out.println(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334")); // IPv6
            System.out.println(validIPAddress("2001:db8:85a3::8a2e:370:7334")); // Neither
        }
    }

