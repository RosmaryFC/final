package radiobutton;

import java.util.HashMap;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {

    HashMap<Integer, Boolean> radioButtons;


    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        // TODO: Implement this method.

        if(initial > numButtons || initial < 1){
            throw new RuntimeException("The initial button number is invalid");
        }

        radioButtons = new HashMap<Integer, Boolean>();
        for(int i = 0; i < numButtons; i ++){

            if(numButtons == initial){
                radioButtons.put(i, true);
            }else {
                radioButtons.put(i, false);
            }
        }
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        // TODO: Implement this method.
        for (int btn : radioButtons.)

        radioButtons.put(button, true);
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {
        // TODO: Implement this method.
        return false;
    }

    // TODO: Add attributes and helper methods as needed.

}
