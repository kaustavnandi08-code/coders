"""
IST Greeting Voice Bot
-----------------------
Speaks "Good Morning / Afternoon / Evening / Night" based on
current Indian Standard Time (IST), regardless of your system's
timezone setting.z


Requirements:
    pip install pyttsx3 tzdata
"""

from datetime import datetime
from zoneinfo import ZoneInfo
import pyttsx3


def get_ist_time():
    """Return current datetime in Indian Standard Time."""
    ist = ZoneInfo("Asia/Kolkata")
    return datetime.now(ist)


def get_greeting(hour):
    """Return the appropriate greeting based on the hour (24-hr format)."""
    if 5 <= hour < 12:
        return "Good Morning"
    elif 12 <= hour < 17:
        return "Good Afternoon"
    elif 17 <= hour < 21:
        return "Good Evening"
    else:
        return "Good Night"


def speak(text):
    """Convert text to speech."""
    engine = pyttsx3.init()
    engine.setProperty("rate", 160)   # speaking speed
    engine.setProperty("volume", 1.5) # max volume
    engine.say(text)
    engine.runAndWait()


def main():
    now_ist = get_ist_time()
    current_hour = now_ist.hour
    current_time_str = now_ist.strftime("%I:%M %p")

    greeting = get_greeting(current_hour)
    message = f"{greeting}! The current time in India is {current_time_str}."

    print(message)
    speak(message)


if __name__ == "__main__":
    main()