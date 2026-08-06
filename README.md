# 📧 AI Email Writer Assistant

An AI-powered email reply generator that integrates directly with Gmail using a Chrome Extension. It uses Google's Gemini API to generate professional, friendly, formal, or casual email replies with a single click.

---

## 🚀 Features

- ✨ Generates AI-powered email replies
- 📩 Integrates directly into Gmail
- 🎭 Multiple reply tones
  - Professional
  - Friendly
  - Casual
  - Formal
- ⚡ One-click reply generation
- 🔒 Secure backend using Spring Boot
- 🌐 REST API for communication between frontend and extension
- 🤖 Powered by Google Gemini AI

---

# 🏗️ Project Structure

```
email-writer-assistant/

│
├── backend/        # Spring Boot REST API
│
├── frontend/       # React Web Application
│
├── extension/      # Chrome Extension
│
└── README.md
```

---

# 🛠️ Tech Stack

## Backend

- Java
- Spring Boot
- Spring Web
- WebClient
- Maven

## Frontend

- React
- JavaScript
- Material UI
- Axios

## Browser Extension

- Chrome Extension Manifest V3
- JavaScript
- HTML
- CSS

## AI

- Google Gemini API

---

# ⚙️ How It Works

```
Gmail
   │
   ▼
Chrome Extension
   │
   ▼
Spring Boot Backend
   │
   ▼
Gemini API
   │
   ▼
Generated Reply
   │
   ▼
Displayed inside Gmail
```

---

# 📸 Screenshots

Add screenshots here after uploading them.

Example:

```
screenshots/

gmail.png

reply-button.png

generated-reply.png
```

---

# 📦 Installation

## Clone Repository

```
git clone https://github.com/annutatale/email-writer-assistant.git
```

---

## Backend

```
cd backend
```

Configure your Gemini API Key inside

```
application.properties
```

Example

```
gemini.api.key=YOUR_API_KEY
gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent
```

Run

```
mvn spring-boot:run
```

Backend runs on

```
http://localhost:8080
```

---

## Frontend

```
cd frontend
npm install
npm run dev
```

Runs on

```
http://localhost:5173
```

---

## Chrome Extension

1. Open Chrome
2. Go to

```
chrome://extensions
```

3. Enable Developer Mode

4. Click

```
Load unpacked
```

5. Select

```
extension/
```

6. Open Gmail and start composing or replying to an email.

---

# 📡 API Endpoint

## Generate Reply

```
POST /api/email/generate
```

Request

```json
{
  "emailContent": "Can we schedule a meeting tomorrow?",
  "tone": "Professional"
}
```

Response

```json
{
  "reply": "Thank you for your email. I would be happy to schedule a meeting tomorrow..."
}
```

---

# 🎯 Future Improvements

- Support multiple AI providers (OpenAI, Claude, Gemini)
- Reply length selection
- Custom writing style
- Multi-language support
- Dark mode
- Reply history
- User authentication
- Cloud deployment

---

# 👨‍💻 Author

**Aniket Tatale**

Final Year B.E. Computer Science (AI & ML)

Java | Spring Boot | React | Chrome Extensions | AI Integration

GitHub:
https://github.com/annutatale

LinkedIn:
https://linkedin.com/in/annutatale

---

# ⭐ If you found this project useful

Please consider giving it a ⭐ on GitHub!
